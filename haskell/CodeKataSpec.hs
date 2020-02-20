import CodeKata (test)
import Test.Hspec

main :: IO ()
main = hspec $
  describe "Example Tests" $
    it "should work with example tests" $ do
      test "irrelevant string" `shouldBe` True
