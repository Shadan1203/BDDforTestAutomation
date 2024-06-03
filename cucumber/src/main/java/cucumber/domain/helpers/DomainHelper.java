package cucumber.domain.helpers;

import cucumber.domain.models.Account;
import cucumber.domain.models.CashSlot;

public class DomainHelper {

	private Account account;
	private CashSlot cashSlot;

	public Account getAccount() {
		if (account == null) {
			account = new Account ();
		}
		return account;
	}
	
	public CashSlot getCashSlot() {
		if (cashSlot == null) {
			cashSlot = new CashSlot ();
		}
		return cashSlot;
	}

}
