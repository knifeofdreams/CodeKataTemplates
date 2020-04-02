using Xunit;
using Kata.Services;

namespace Kata.UnitTests.Services
{
    public class KataService_IsPrimeShould
    {
        private readonly KataService _kataService;

        public KataService_IsPrimeShould()
        {
            _kataService = new KataService();
        }

        [Theory]
        [InlineData(-1)]
        [InlineData(0)]
        [InlineData(1)]
        public void IsPrime_ValuesLessThan2_ReturnFalse(int value)
        {
            var result = _kataService.IsPrime(value);

            Assert.False(result, $"{value} should not be prime");
        }
    }
}
