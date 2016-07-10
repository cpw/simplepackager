/*
 *     Simple Packager - some simple packaging stuffs
 *     Copyright (C) 2016  cpw
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cpw.mods.simplepackager;

import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cpw on 09/07/16.
 */
public class EmptyTweaker implements ITweaker
{
    private List<String> args;
    @Override
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile)
    {
        this.args = new ArrayList<>(args);
        this.args.add("--version");
        this.args.add(profile);
        this.args.add("--gameDir");
        this.args.add(gameDir.getAbsolutePath());
        this.args.add("--assetsDir");
        this.args.add(assetsDir.getAbsolutePath());
    }

    @Override
    public void injectIntoClassLoader(LaunchClassLoader classLoader)
    {

    }

    @Override
    public String getLaunchTarget()
    {
        return "net.minecraft.client.main.Main";
    }

    @Override
    public String[] getLaunchArguments()
    {
        return this.args.toArray(new String[this.args.size()]);
    }
}
