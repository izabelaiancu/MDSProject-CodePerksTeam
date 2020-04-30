package com.mds.mds;

import com.mds.mds.repository.RepositoryProduse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories(basePackageClasses = RepositoryProduse.class)
@SpringBootApplication
public class MdsApplication {


    public static void main(String[] args) {
        SpringApplication.run(MdsApplication.class, args);
     ///   System.out.println("merge");
    }


}


