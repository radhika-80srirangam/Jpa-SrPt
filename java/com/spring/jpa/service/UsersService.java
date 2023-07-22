package com.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.dto.Usersdto;
import com.spring.jpa.entity.Users;
import com.spring.jpa.entity.Users1;
import com.spring.jpa.repository.Users1Repository;
import com.spring.jpa.repository.UsersRepository;

@Service
public class UsersService {

	private static final int List = 0;
	private static final int Usersdto = 0;
	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private Users1Repository Repository;

	public void saveUsers(Usersdto usersdto) {
		Users user = new Users();
		user.setName(usersdto.getName());
		user.setName(usersdto.getCode());
		user.setName(usersdto.getEmail());
		user.setName(usersdto.getPhone());
		user.setName(usersdto.getContact_person_name());
		user.setName(usersdto.getContact_person_phone());
		user.setName(usersdto.getStatus());
		user.setName(usersdto.getCreated_by());
		user.setName(usersdto.getModified_by());
		usersRepository.save(user);
		Users1 user1 = new Users1();
		user1.setName_1(usersdto.getName_1());
		user1.setCode_1(usersdto.getCode_1());
		user1.setEmail_1(usersdto.getEmail_1());
		user1.setPhone_1(usersdto.getPhone_1());
		user1.setStatus_1(usersdto.getStatus_1());
		Repository.save(user1);
	}

	@Autowired
	private Users1Repository users1Repository;

	public void saveUsers1(Users1 users1) {

		users1Repository.save(users1);
	}

	public Usersdto getAll() {

		Usersdto dd = new Usersdto();

		dd.setDetails(usersRepository.findAll());

		dd.setDetails2(Repository.findAll());

		return dd;

	}

	/*
	 * public List<Users> searchAllUsersByName (String name) {
	 * 
	 * return usersRepository.findAllByName(name);
	 * 
	 * } public Optional<Users> getById(UUID id) {
	 * 
	 * return usersRepository.findById(id);
	 * 
	 * } public void deleteUsers (UUID id){ usersRepository.deleteById(id);
	 * 
	 * } public Users updateUsers (Users users) {
	 * 
	 * UUID id = users.getId(); Users usr = usersRepository.findById(id).get();
	 * usr.setName(users.getName()); usr.setCode(users.getCode());
	 * usr.setEmail(users.getEmail());
	 * usr.setContact_person_name(users.getContact_person_name());
	 * usr.setContact_person_name(users.getContact_person_phone());
	 * usr.setStatus(users.getStatus()); usr.setCreated_by(users.getCreated_by());
	 * usr.setModified_by(users.getModified_by()); return usersRepository.save(usr);
	 * }
	 */
}
