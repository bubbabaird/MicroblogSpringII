package com.theironyard.charlotte;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by BUBBABAIRD on 5/9/17.
 */
// a repository is what interacts with your database
// when extending a CRUD Repository interface, the first parameter in the diamond operator
// is the thing you want to store.  The second thing is the type of the id column.
public interface GameRepository extends CrudRepository<Message, Integer>{
}
