//
// Created by Joakim Nohlgård on 2020-02-20.
//

#include "CodeKata.h"

CodeKata::CodeKata(int num) : _num(num) {}

int CodeKata::add(int num) {
  _num += num;
  return _num;
}

int CodeKata::get() {
  return _num;
}

