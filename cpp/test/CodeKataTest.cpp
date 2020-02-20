//
// Created by Joakim Nohlgård on 2020-02-20.
//

#include "CodeKata.h"
#include "catch2/catch.hpp"

TEST_CASE( "CodeKata example case", "[tag1],[tag2]" ) {

  CodeKata sut( 5 );

  REQUIRE( sut.get() == 5 );

  SECTION( "adding changes number" ) {
    sut.add(10);

    REQUIRE( sut.get() == 15 );
    int res = sut.add(-5);

    REQUIRE( sut.get() == 10 );
    REQUIRE( res == sut.get() );
  }
}
