package com.turgutguduk.repository.test2;

import com.turgutguduk.model.Test3;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by turgut on 19.03.2016.
 */
public interface Test2Repository extends JpaRepository<Test3,Integer>
{
}
