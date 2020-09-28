package ru.studentsplatform.blockchain.endpoint.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.studentsplatform.blockchain.domain.repository.BlockRepository;
import ru.studentsplatform.blockchain.entities.block.Block;

/**
 * @author Krylov Sergey (27.09.2020)
 */
@RestController
@RequestMapping("/")
public class MainController {
	private final BlockRepository blockRepository;

	@Autowired
	public MainController(BlockRepository blockRepository) {
		this.blockRepository = blockRepository;
	}

	@GetMapping("/")
	public String mainPage() {
		return "Main page";
	}

	@GetMapping("/add/{data}")
	public String addBlock(@PathVariable String data) {
		Block s = new Block();
		s.setData(data);
		return  blockRepository.save(s).toString();
	}
}
