# simplepackager
Simple packager for adding jar mods without modifying the bloody jar

In response to the annoyance of people who still insist on deleting meta-inf, here's a simple gradle script and "no-op" tweaker
which can be used to ship modified minecraft classes, in blatant violation of the Mojang license.

The zip file it outputs (buildJars task) is designed to be directly extracted either next
to "minecraft_server.<version>.jar" or over the top of a minecraft client installation. 

To run on the server, execute the executable jar file it creates (default example-1.0.jar).
To run in the client, select the "exampleprofile" version that gets created in a new minecraft profile.

The tweaker is basically a no-op, used solely to bypass signature validation on overridden minecraft classes without having to
delete the META-INF (**don't do that, by the way, it's completely unnecessary!**)
