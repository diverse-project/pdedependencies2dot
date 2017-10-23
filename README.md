# pdedependencies2dot

## Description

Given a folder full of Eclipse plugins projects and features projects, generates a dot dependency graph by reading all the OSGI `MANIFEST.MF` files and the Eclipse `feature.xml` files of a set of folders.

![Example](https://raw.githubusercontent.com/diverse-project/pdedependencies2dot/master/example.png)

## Options 

~~~~
Usage: java -jar pdedependencies2dot-1.0-shaded.jar [options...] <folder1,folder2,...>

Arguments and options:
 folder1,folder2,...                   : List of folders recursively containing
                                         plugins and features.
 --allowedPrefixes=STRING              : List of allowed prefixes. If given, a
                                         found plugin/feature is not taken into
                                         account if its id doesn't match one of
                                         these prefixes. (default:
                                         org.eclipse.gemoc)
 --alwaysPrint                         : If set, the output is printed even if
                                         an output file is given.
 --colorSeed=N                         : Seed for the color randomizer. Each
                                         seed is a completely different color
                                         set. (default: 12)
 --excludedFilePatterns=STRING         : List of glob patterns (e.g
                                         **/badfolder/**). If given, a found
                                         plugin/feature is not taken into
                                         account if its file path matches one
                                         of these patterns
 --filteredPrefixes=STRING             : List of forbidden prefixes. If given,
                                         a found plugin/feature is not taken
                                         into account if its id matches one of
                                         these prefixes.
 --hideExternal                        : If set, external dependencies/reference
                                         s for which no MANIFEST.MF/plugin.xml
                                         was found are not displayed.
 --orientation=[horizontal | vertical] : Sets the overall shape of the graph.
                                         (default: horizontal)
 --outputFile=FILE                     : Path to the output file. If given,
                                         will write into this file instead of
                                         printing to the console. (default:
                                         /tmp/mygraph.dot)
~~~~


## Compiling & Using

~~~
$ git clone https://github.com/diverse-project/pdedependencies2dot.git
$ cd pdedependencies2dot
$ mvn package
~~~

That should produce `target/pdedependencies2dot-1.0-shaded.jar`, which is executable and contains all dependencies.

To use it:

~~~
$ java -jar target/pdedependencies2dot-1.0-shaded.jar --allowedPrefixes=org.company --filteredPrefixes=org.eclipse --outputFile=/tmp/mygraph.dot /my/development/folder
~~~


## Future work

zest visualization within eclipse?
