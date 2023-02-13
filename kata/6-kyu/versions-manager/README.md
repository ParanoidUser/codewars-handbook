# [Versions manager](https://www.codewars.com/kata/versions-manager "https://www.codewars.com/kata/5bc7bb444be9774f100000c3")

In this kata we are going to mimic a software versioning system.

You have to implement a `VersionManager` class.

It should accept an optional parameter that represents the initial version. The input will be in one
of the following formats: `"{MAJOR}"`, `"{MAJOR}.{MINOR}"`, or `"{MAJOR}.{MINOR}.{PATCH}"`. More
values may be provided after `PATCH` but they should be ignored. If these 3 parts are not decimal
values, an exception with the message `"Error occured while parsing version!"` should be thrown. If
the initial version is not provided or is an empty string, use `"0.0.1"` by default.

This class should support the following methods, all of which should be chainable (
except `release`):

* `major()` - increase `MAJOR` by `1`, set `MINOR` and `PATCH` to `0`
* `minor()` - increase `MINOR` by `1`, set `PATCH` to `0`
* `patch()` - increase `PATCH` by `1`
* `rollback()` - return the `MAJOR`, `MINOR`, and `PATCH` to their values before the
  previous `major`/`minor`/`patch` call, or throw an exception with the message `"Cannot rollback!"`
  if there's no version to roll back to. Multiple calls to `rollback()` should be possible and
  restore the version history
* `release()` - return a string in the format `"{MAJOR}.{MINOR}.{PATCH}"`