package BartlomiejFraczak.ListaLekow.Dao;

import BartlomiejFraczak.ListaLekow.Model.LekModel;
import BartlomiejFraczak.ListaLekow.Repository.LekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LekDao {

    @Autowired
    LekRepository lekRepository;

    public List<LekModel> findAll() {
        return lekRepository.findAll();
    }

    public LekModel save(LekModel lek) {
        return lekRepository.save(lek);
    }

    public boolean isEmpty() {
        if (lekRepository.rowCountIn1stRow() == 0)
            return true;
        else
            return false;
    }

}
