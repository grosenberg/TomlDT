/*
 * [The "BSD license"]
 * Copyright (c) 2008-2014 Gerald Rosenberg
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
 * Example grammar. Syntax is intended to be TOML-like.
 */
parser grammar TomlParser ; 

options {
	language   =Java	  ;
	tokenVocab =TomlLexer ;
}

@header {
	package com.certiv.toml.dt.core.parser.gen;
}

// ----------------------------------------------------------------------
// PARSER RULES
toml
	:	( table
		| tableArray
		| element
		)*
	EOF 
	;

table
	: LBRACKET dottedID RBRACKET element*
	;

tableArray
	: LARRAY dottedID RARRAY element*
	;

element
	: key EQUAL value
	;

key
	: ID
	| STRING
	;

value
	: array
	| inlineTable
	| scalar
	| string
	;

array
	: LBRACKET ( value (SEP value )* )? SEP? RBRACKET
	;

inlineTable
	: LBRACE element ( SEP element )* RBRACE
	;

scalar
	: BOOLEAN
	| DATE
	| NUMBER
	;

string
	: STRING
	| LITERAL
	;

dottedID
	: ids+=ID ( DOT ids+=ID )*
	;
