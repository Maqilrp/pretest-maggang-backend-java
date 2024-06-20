@Entity
public class DetailTransaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailTransaksiId;

    @ManyToOne
    @JoinColumn(name = "transaksi_id")
    private Transaksi transaksi;

    @ManyToOne
    @JoinColumn(name = "produk_id")
    private Produk produk;
    
    private Integer jumlah;
    private Double harga;
    
    // getters and setters
}