package xyz.stasiak.cobudgetbackend.moneyentry.expense;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    private final AddExpenseService addExpenseService;

    public ExpenseController(AddExpenseService addExpenseService) {
        this.addExpenseService = addExpenseService;
    }

    @PostMapping
    public ResponseEntity<Expense> add(@RequestBody Expense expense, Principal principal) {
        Expense result = addExpenseService.add(expense, principal.getName());
        return ResponseEntity.ok(result);
    }
}
