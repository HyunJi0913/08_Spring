package org.scoula.config;

import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.fail;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j2
class RootConfigTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    @DisplayName("DataSource 연결 테스트")
    void dataSourceTest() {
        try (Connection con = dataSource.getConnection()) {
            log.info("✅ DataSource 연결 성공");
            log.info("Connection = {}", con);
        } catch (Exception e) {
            fail("❌ DataSource 연결 실패: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("SqlSessionFactory 연결 테스트")
    void sqlSessionFactoryTest() {
        try (
                SqlSession session = sqlSessionFactory.openSession();
                Connection con = session.getConnection()
        ) {
            log.info("✅ SqlSessionFactory 연결 성공");
            log.info("SqlSession = {}", session);
            log.info("Connection = {}", con);
        } catch (Exception e) {
            fail("❌ SqlSessionFactory 연결 실패: " + e.getMessage());
        }
    }
}
