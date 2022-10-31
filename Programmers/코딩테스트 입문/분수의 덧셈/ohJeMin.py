import fractions
def solution(denum1, num1, denum2, num2):
    a = fractions.Fraction(denum1, num1)
    b = fractions.Fraction(denum2, num2)
    result = a + b
    aNumerator = result.numerator
    bDenominator = result.denominator
    answer = [aNumerator, bDenominator]
    return answer