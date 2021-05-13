import model.ShoppingCart;
import org.junit.jupiter.api.Test;
import service.CalculatorDiscount;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DiscountCalculatorTest {

    //AAA
    @Test
    public void shouldNotApplyDiscountUntil499() {
        //Arrange
        var calculator = new CalculatorDiscount();
        var cart = new ShoppingCart();
        cart.price = 430.50;

        //Act
        var discountValue = calculator.calculateDiscount(cart);

        //Assert
        assertThat(discountValue, is(0.0));
    }

    @Test
    public void shouldNotApplyDiscountEqualTo499() {
        var calculator = new CalculatorDiscount();
        var cart = new ShoppingCart();
        cart.price = 499.99;

        var discountValue = calculator.calculateDiscount(cart);

        assertThat(discountValue, is(0.0));
    }

    @Test
    public void shouldApplyTenPercentStarting500() {
        var calculator = new CalculatorDiscount();
        var cart = new ShoppingCart();
        cart.price = 501.00;

        var discountValue = calculator.calculateDiscount(cart);

        assertThat(discountValue, is(10.0));
    }

    @Test
    public void shouldApplyTenPercentEqualsTo500() {
        var calculator = new CalculatorDiscount();
        var cart = new ShoppingCart();
        cart.price = 500.00;

        var discountValue = calculator.calculateDiscount(cart);

        assertThat(discountValue, is(10.0));
    }

    @Test
    public void shouldApplyTenPercentEqualsTo1000() {
        var calculator = new CalculatorDiscount();
        var cart = new ShoppingCart();
        cart.price = 1000.00;

        var discountValue = calculator.calculateDiscount(cart);

        assertThat(discountValue, is(20.0));
    }

    @Test
    public void shouldApplyTenPercentStarting1000() {
        var calculator = new CalculatorDiscount();
        var cart = new ShoppingCart();
        cart.price = 1001.00;

        var discountValue = calculator.calculateDiscount(cart);

        assertThat(discountValue, is(20.0));
    }

}
