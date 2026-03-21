package tmxlab.homelab.companies;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CompaniesService {

    private final CompaniesRepository companiesRepository;

    public CompaniesService(CompaniesRepository companiesRepository) {
        this.companiesRepository = companiesRepository;
    }

    public List<Company> getAllCompanies() {
        return companiesRepository.findAll();
    }
}
