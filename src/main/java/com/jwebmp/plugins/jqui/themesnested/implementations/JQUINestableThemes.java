package com.jwebmp.plugins.jqui.themesnested.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class JQUINestableThemes implements IGuiceScanModuleInclusions<JQUINestableThemes>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.jqueryui.themes.nestable");
		return set;
	}
}
