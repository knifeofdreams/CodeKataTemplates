import CodeKata from "./kata";

let kata = new CodeKata();

test('simple square test', () => {
    expect(kata.square(5)).toBe(25);
});

test('squaring negative number', () => {
    expect(kata.square(-1)).toBe(1);
});
