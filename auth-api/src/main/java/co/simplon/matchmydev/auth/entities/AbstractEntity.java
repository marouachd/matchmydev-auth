package co.simplon.matchmydev.auth.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public AbstractEntity() {
	// TODO Auto-generated constructor stub
    }

    public Long getId() {
	return id;
    }

    @SuppressWarnings("unused")
    private void setId(Long id) {
	// prevents from accidental assignements (set from DB)
	this.id = id;
    }

}
