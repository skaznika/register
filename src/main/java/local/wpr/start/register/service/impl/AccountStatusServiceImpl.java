package local.wpr.start.register.service.impl;

import local.wpr.start.register.model.AccountStatus;
import local.wpr.start.register.repository.AccountStatusRepository;
import local.wpr.start.register.service.AccountStatusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountStatusServiceImpl implements AccountStatusService {
    private static final Logger logger = LoggerFactory.getLogger(AccountStatusServiceImpl.class);
    @Autowired
    private AccountStatusRepository accountStatusRepository;

    public AccountStatusServiceImpl(AccountStatusRepository accountStatusRepository) {
        this.accountStatusRepository = accountStatusRepository;
    }

    @Override
    public List<AccountStatus> getAll() {
        return accountStatusRepository.findAll();
    }

    @Override
    public AccountStatus getById(Long accountId) {
        return accountStatusRepository.getReferenceById(accountId);
    }

    public void saveAccountStatus(AccountStatus accountStatus) {
        accountStatusRepository.save(accountStatus);
    }
}
