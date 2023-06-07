/*
 * [The "BSD license"]
 * Copyright (c) 2008-2023 Gerald Rosenberg
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Simple, example grammar.  Syntax is intended to be TOML-like.
 */
lexer grammar TomlLexer ;

@header {
	package com.certiv.toml.dt.core.parser.gen;
}

// ----------------------------------------------------------------------
// LEXER RULES


DOC_COMMENT		: DocComment		-> channel(HIDDEN)	;
BLOCK_COMMENT	: BlockComment		-> channel(HIDDEN)	;
LINE_COMMENT	: LineComment		-> channel(HIDDEN)	;

HORZ_WS		: Hws+			-> channel(HIDDEN)	;
VERT_WS		: Vws+			-> channel(HIDDEN)	;

LARRAY		: LArray	;
RARRAY		: RArray	;
LBRACKET	: LBracket	;
RBRACKET	: RBracket	;
LBRACE		: LBrace	;
RBRACE		: RBrace	;

DOT			: Dot		;
EQUAL		: Equal		;
LITERAL		: StLiteral	;
STRING		: DQLiteral
			| SQLiteral
			;

BOOLEAN		: True | False	;
NUMBER		: Number 		;
DATE		: Date			;
SEP			: Comma			;

ID			: Id	;


// ------------------------------------------------------------------------------

fragment Hws			: [ \t]		;
fragment Vws			: [\r\n\f]	;

fragment DocComment		: '/**' .*? ('*/' | EOF) ;
fragment BlockComment	: '/*'  .*? ('*/' | EOF) ;
fragment LineComment	: '#' ~[\r\n]* ( '\r'? '\n' Hws* '#' ~[\r\n]* )*	;

fragment SQLiteral		: SQuote ( EscSeq | ~['\r\n\\] )* SQuote	;
fragment DQLiteral		: DQuote ( EscSeq | ~["\r\n\\] )* DQuote	;
fragment StLiteral		: LitQuote .*? LitQuote						;

// escaped short-cut character or Unicode literal
fragment EscSeq
	:	Esc
		( [btnfr"\\]	// standard escaped character set
		| UnicodeEsc	// standard Unicode escape sequence
		| .				// Invalid escape character
		| EOF			// Incomplete at EOF
		)
	;

fragment UnicodeEsc
	:	'u' (Hex (Hex (Hex Hex?)?)?)?
	;

// A valid hex digit
fragment Hex	: [0-9a-fA-F]	;

fragment Number
	: Int Frac Exp?
	| Int Exp
	| Int
	;

fragment Int
	: [+\-]?
	( '0' | [1-9] Digit* )
	;

fragment Date	: Yr '-' Mon '-' Day 'T' Hr ':' Min ':' Sec
					( [Zz]
					| ( '.' Digit6 )? '-' Min ':' Sec
					)
				;

fragment Yr		: Digit4	;
fragment Mon	: Digit2	;
fragment Day	: Digit2	;
fragment Hr		: Digit2	;
fragment Min	: Digit2	;
fragment Sec	: Digit2	;

fragment Frac	: Dot Digit+		;
fragment Exp	: [eE] Int			;
fragment Digit	: [0-9]				;
fragment Digit2	: Digit Digit		;
fragment Digit4	: Digit2 Digit2		;
fragment Digit6	: Digit4 Digit2		;

fragment True	: 'true'	;
fragment False	: 'false'	;

fragment Id
	: NameStartChar NameChar*
	;

fragment NameChar
	:	NameStartChar
	|	'0'..'9'
	|	'_'
	|	'\u00B7'
	|	'\u0300'..'\u036F'
	|	'\u203F'..'\u2040'
	;

fragment NameStartChar
	:	'A'..'Z'
	|	'a'..'z'
	|	'\u00C0'..'\u00D6'
	|	'\u00D8'..'\u00F6'
	|	'\u00F8'..'\u02FF'
	|	'\u0370'..'\u037D'
	|	'\u037F'..'\u1FFF'
	|	'\u200C'..'\u200D'
	|	'\u2070'..'\u218F'
	|	'\u2C00'..'\u2FEF'
	|	'\u3001'..'\uD7FF'
	|	'\uF900'..'\uFDCF'
	|	'\uFDF0'..'\uFFFD'
	;	// ignores | ['\u10000-'\uEFFFF] ;

fragment Equal			: '='	;
fragment Comma			: ','	;
fragment Dot			: '.'	;
fragment LBrace			: '{'	;
fragment RBrace			: '}'	;
fragment LBracket		: '['	;
fragment RBracket		: ']'	;
fragment LArray			: '[['	;
fragment RArray			: ']]'	;
fragment Esc			: '\\'	;
fragment SQuote			: '\''	;
fragment DQuote			: '"'	;
fragment LitQuote		: '"""'	;
