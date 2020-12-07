package day03_springdemo.service.impl;

import day03_springdemo.mapper.AccountMapper;
import day03_springdemo.bean.Account;
import day03_springdemo.service.AccountService;
import day03_springdemo.utils.TransactionManager;

import java.util.List;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements AccountService {

    private AccountMapper accountMapper;
    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountMapper.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountMapper.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer acccountId) {
        accountMapper.deleteAccount(acccountId);
    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        //2.1根据名称查询转出账户
        Account source = accountMapper.findAccountByName(sourceName);
        //2.2根据名称查询转入账户
        Account target = accountMapper.findAccountByName(targetName);
        //2.3转出账户减钱
        source.setMoney(source.getMoney()-money);
        //2.4转入账户加钱
        target.setMoney(target.getMoney()+money);
        int a = 1/3;
        //2.5更新转出账户
        accountMapper.updateAccount(source);


        //2.6更新转入账户
        accountMapper.updateAccount(target);
    }
}
