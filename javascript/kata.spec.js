'use strict';

var kata = require('./kata');
var expect = require('chai').expect;


describe('CodeKata', function() {
    describe('#testMethod', function() {
        it('should return True', function() {
            var codeKata = new kata.CodeKata;
            expect(codeKata.testMethod()).to.be.true;
        });
    });
});

describe('#test', function() {
    it('should return 3', function() {
        expect(kata.my_test()).to.be.equal('my_test');
    });
});
