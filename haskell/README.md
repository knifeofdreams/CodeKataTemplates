# Installation

## Haskell

Choose the installation info of your platform from [here](https://www.haskell.org/platform/).  
For mac I recommend using [ghcup](https://www.haskell.org/ghcup/) to install to install `ghc` and `cabal-install`.

## HSpec
Install [HSpec](https://hackage.haskell.org/package/hspec) with

```shell script
cabal update && cabal install --lib hspec
```

## Running the unit test
Navigate to the directory where the `CodeKataSpec.hs` test file is and run:
```shell script
$ runhaskell CodeKataSpec.hs
```
It will fail with the following error message:
```shell script
$ runhaskell CodeKataSpec.hs
Loaded package environment from {#your_environment}

Example Tests
  should work with example tests FAILED [1]

Failures:

  CodeKataSpec.hs:8:7: 
  1) Example Tests should work with example tests
       expected: True
        but got: False

  To rerun use: --match "/Example Tests/should work with example tests/"

Randomized with seed 752281758

Finished in 0.0013 seconds
1 example, 1 failure
```
If you insert the following code block to `CodeKata.hs`:
```haskell
module CodeKata (test) where

test :: String -> Bool
test string = True

```
It will pass with:
```shell script
$ runhaskell CodeKataSpec.hs
Loaded package environment from {#your_environment}

Example Tests
  should work with example tests

Finished in 0.0003 seconds
1 example, 0 failures
```
