package BartlomiejFraczak.ListaLekow.Repository;

import BartlomiejFraczak.ListaLekow.Model.LekModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LekRepository extends JpaRepository<LekModel, Integer> {

    @Query("SELECT COUNT(*) FROM LekModel WHERE ROWNUM=1")
    int rowCountIn1stRow();
}
