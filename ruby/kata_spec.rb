require "rspec"
require_relative "kata"

describe CodeKata do
  describe "#test" do
    it "returns true" do
      expect(subject.test_method).to be true
    end
  end
end

describe "#test" do
  it "returns my_test string" do
    expect(test).to eq "my_test"
  end
end
