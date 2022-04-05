package xyz.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import xyz.operations.AccountActivity;

@RunWith(Suite.class)
@SuiteClasses({TestWithdrawal.class, TestDeposit.class})
public class AccountActivityTest extends AccountActivity{

}
