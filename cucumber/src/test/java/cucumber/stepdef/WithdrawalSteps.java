package cucumber.stepdef;

import org.junit.Assert;

import cucumber.domain.helpers.DomainHelper;
import cucumber.domain.models.Teller;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawalSteps {

	private DomainHelper domainHelper;

	public WithdrawalSteps() {
		domainHelper = new DomainHelper();

	}

	@Given("I have a balance of ${int} in my account")
	public void iHaveABalanceOf$InMyAccount(int amount) {
		domainHelper.getAccount().deposit(amount);
		Assert.assertEquals(amount, domainHelper.getAccount().getBalance());
	}

	@When("I request ${int}")
	public void iRequest$(int requestAmount) {
		Teller teller = new Teller(domainHelper.getCashSlot());
		teller.withdrawCash(domainHelper.getAccount(), requestAmount);
	}

	@Then("${int} should be dispensed")
	public void $ShouldBeDispensed(int dispensedAmount) {
		Assert.assertEquals(dispensedAmount, domainHelper.getCashSlot().getContents());	
	}

}
