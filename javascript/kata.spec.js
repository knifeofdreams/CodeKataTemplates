'use strict';

const CodeKata = require('./kata').CodeKata;
const myTest = require('./kata').myTest;
const expect = require('chai').expect;


describe('CodeKata', function() {
    describe('#testMethod', function() {
        it('should return True', function() {
            const codeKata = new CodeKata;
            expect(codeKata.testMethod()).to.be.true;
        });
    });
});

describe('#test', function() {
    it('should return 3', function() {
        expect(myTest()).to.be.equal('my_test');
    });
});
