package BartlomiejFraczak.ListaLekow.Controller;

import BartlomiejFraczak.ListaLekow.Dao.LekDao;
import BartlomiejFraczak.ListaLekow.Model.LekModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;

@Controller
public class LekController {
    @Autowired
    LekDao lekDao;

    @PostConstruct
    public void init() {
        if(lekDao.isEmpty()){
            createDbRecords();
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<LekModel>> mainMenu() {
        return new ResponseEntity<List<LekModel>>(lekDao.findAll(), HttpStatus.OK);
    }

    private void createDbRecords() {
        lekDao.save(new LekModel("Ibuprom", LocalDate.of(2023, 12, 20), 251));
        lekDao.save(new LekModel("Acard", LocalDate.of(2022, 12, 10), 24));
        lekDao.save(new LekModel("APAP", LocalDate.of(2025, 5, 3), 322));
        lekDao.save(new LekModel("Euthyrox N", LocalDate.of(2021, 8, 8), 13));
        lekDao.save(new LekModel("Bisocard", LocalDate.of(2024, 6, 5), 42));
        lekDao.save(new LekModel("Bisocard", LocalDate.of(2025, 7, 15), 53));
        lekDao.save(new LekModel("Rutinoscorbin", LocalDate.of(2025, 11, 15), 52));
        lekDao.save(new LekModel("Magne B6", LocalDate.of(2023, 5, 21), 102));
    }


}
