/*
 ** 2014 August 22
 **
 ** The author disclaims copyright to this source code. In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.minecraft.minema.util.config;

import net.minecraftforge.common.config.Property;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class ConfigString extends ConfigValue<String> {

	public ConfigString(final String value) {
		super(value);
	}

	@Override
	public Property.Type getPropType() {
		return Property.Type.STRING;
	}

	@Override
	public void importProp(final Property prop) {
		set(prop.getString());
	}

	@Override
	public void exportProp(final Property prop) {
		prop.set(get());
		prop.setDefaultValue(getDefault());
	}

}
