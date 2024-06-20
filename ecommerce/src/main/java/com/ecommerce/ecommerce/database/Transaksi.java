@Entity
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaksiId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate tanggalTransaksi;
    private Double totalHarga;
}
