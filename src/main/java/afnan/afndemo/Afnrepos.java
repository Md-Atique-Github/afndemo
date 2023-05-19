package afnan.afndemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Afnrepos extends JpaRepository<UserModel,Long>{
    
}
