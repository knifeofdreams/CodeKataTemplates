#!/usr/bin/env bats

source ./codekata.sh

@test "life the universe and everything" {
  local actual=$(answer)
  [ "$actual" == "42" ]
}
