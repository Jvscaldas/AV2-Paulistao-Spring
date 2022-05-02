package br.com.joaosantana.SpringPaulistao.persistence;

import java.sql.SQLException;
import java.util.List;

import br.com.joaosantana.SpringPaulistao.model.Times;

public interface ISorteioDao {

	public List<Times> findTimes() throws SQLException, ClassNotFoundException;
}