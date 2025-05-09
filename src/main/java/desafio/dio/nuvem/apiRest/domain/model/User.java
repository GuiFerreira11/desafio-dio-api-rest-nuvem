package desafio.dio.nuvem.apiRest.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @OneToOne(cascade = CascadeType.ALL)
  private Account account;
  @OneToOne(cascade = CascadeType.ALL)
  private Card card;
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Feature> features;
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<News> news;
}
