package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	//dummy list of records
	List<Record>list=List.of(
			new Record(1L,"Tata@gmail.com","Tata Motors",1311L),
			new Record(2L,"Mahindra@gmail.com","Mahindra & Mahindra",1312L),
			new Record(3L,"ctc@gmail.com","Ctc",1313L),
			new Record(4L,"accenture@gmail.com","Accenture",1314L),
			new Record(5L,"lt@gmail.com","L&T",1315L),
			new Record(6L,"JBL@gmail.com","JBL",1316L),
			new Record(7L,"Infosys@gmail.com","InfosysS",1317L)

			);
	

	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		return list.stream().filter(record -> record.getEid().equals(eId)).collect(Collectors.toList());
	}

}
