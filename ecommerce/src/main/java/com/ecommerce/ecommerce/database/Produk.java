@Entity
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produkId;
    private String produkNama;
    private String produkDeskripsi;
    private Double harga;
    private Integer stock;
}
