# pdedependencies2dot

## Description

Generates a dot graph by reading all the OSGI `MANIFEST.MF` files and the Eclipse `feature.xml` files of a set of folders.

![Example](https://raw.githubusercontent.com/diverse-project/pdedependencies2dot/master/example.png)

## Options

~~~~
Usage: java -jar pdedependencies2dot.jar [options...] <folder1,folder2,...>

 --allowedPrefixes=STRING  : List of allowed prefixes. If given, a found
                             plugin/feature is not taken into account if its id
                             doesn't match one of these prefixes.
 --filteredPrefixes=STRING : List of forbidden prefixes. If given, a found
                             plugin/feature is not taken into account if its id
                             matches one of these prefixes.
 --outputFile=FILE         : Path to the output file. If given, will write into
                             this file instead of printing to the console.
~~~~

## Future work

zest visualization within eclipse?
