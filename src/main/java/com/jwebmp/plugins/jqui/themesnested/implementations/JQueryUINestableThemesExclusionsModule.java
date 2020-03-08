package com.jwebmp.plugins.jqui.themesnested.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQueryUINestableThemesExclusionsModule
		implements IGuiceScanModuleExclusions<JQueryUINestableThemesExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqueryui.themes.nestable");
		return strings;
	}
}
