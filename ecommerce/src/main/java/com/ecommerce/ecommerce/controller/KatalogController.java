@RestController
@RequestMapping("/api/catalogs")
public class KatalogController {
    @Autowired
    private KatalogService katalogService;

    @GetMapping
    public List<Katalog> getAllCatalogs() {
        return katalogService.getAllKatalog();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Katalog> getCatalogById(@PathVariable Long id) {
        return katalogService.getKatalog(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Katalog createCatalog(@RequestBody Katalog katalog) {
        return katalogService.saveKatalog(katalog);
    }
}
