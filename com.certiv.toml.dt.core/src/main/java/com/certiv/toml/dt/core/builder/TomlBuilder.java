package com.certiv.toml.dt.core.builder;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.certiv.toml.dt.core.TomlCore;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.builder.Cause;
import net.certiv.dsl.core.builder.DslBuilder;
import net.certiv.dsl.core.console.CS;
import net.certiv.dsl.core.log.Log;
import net.certiv.dsl.core.model.ICodeUnit;

public class TomlBuilder extends DslBuilder {

	public static final String BUILDER_ID = "net.certiv.nflow.dt.core.builder";

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}

	@Override
	public String taskId() {
		return BUILDER_ID;
	}

	@Override
	protected IStatus buildUnits(List<ICodeUnit> srcModules, IProgressMonitor monitor, int ticks) throws CoreException {
		Log.info(this, String.format("Building %s", srcModules));

		return Status.OK_STATUS;
	}

	@Override
	protected void report(CS kind, Cause cause, Object... args) {}

	@Override
	protected String destPackage(ICodeUnit unit) {
		return null;
	}
}