@Entity
public class Katalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long katalogId;

    @ManyToOne
    @JoinColumn(name = "produk_id")
    private Produk produk;
}
