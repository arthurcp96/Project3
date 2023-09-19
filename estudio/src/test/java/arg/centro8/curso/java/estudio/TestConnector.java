package arg.centro8.curso.java.estudio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import arg.centro8.curso.java.estudio.connectors.Connector;

@SpringBootTest
public class TestConnector {

    @Test
    void TestConnector(){
        try (Connection conn= Connector.getConnection()){
            ResultSet rs=conn.createStatement().executeQuery("select version()");
            if(rs.next()){
                if(rs.getString(1).length()>1){
                    assertEquals(true, true);
                }else{
                    assertEquals(true, false);
                }
            } 
        } catch (Exception e) {
            assertEquals(true, false);
        }
    }
}
