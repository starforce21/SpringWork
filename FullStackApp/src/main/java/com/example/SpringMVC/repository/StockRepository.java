package com.example.SpringMVC.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringMVC.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock,Integer>{
	
	List<Stock> findByName(String company);
	List<Stock> findByTicker(String ticker);
	Stock findBySingleTicker(String ticker);
	void deleteByTicker(String ticker);
}
