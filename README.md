# pdedependencies2dot

## Description

Generates a dot graph by reading all the OSGI `MANIFEST.MF` files and the Eclipse `feature.xml` files of a set of folders.

![Example](https://raw.githubusercontent.com/diverse-project/pdedependencies2dot/master/example.png)

## Options 

~~~~
Usage: java -jar pdedependencies2dot-1.0-shaded.jar [options...] <folder1,folder2,...>

 --allowedPrefixes=STRING  : List of allowed prefixes. If given, a found
                             plugin/feature is not taken into account if its id
                             doesn't match one of these prefixes.
 --filteredPrefixes=STRING : List of forbidden prefixes. If given, a found
                             plugin/feature is not taken into account if its id
                             matches one of these prefixes.
 --outputFile=FILE         : Path to the output file. If given, will write into
                             this file instead of printing to the console.
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

## Restrictions

In the current version, it won't work if some plugin are in multiple features.

## Future work

zest visualization within eclipse?
