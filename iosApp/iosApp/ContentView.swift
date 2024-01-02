import UIKit
import SwiftUI
import common

struct ComposeView: UIViewControllerRepresentable {
    let root: RootComponent
    
    func makeUIViewController(context: Context) -> UIViewController {
        let controller = MainViewControllerKt.MainViewController(root: root)
        controller.overrideUserInterfaceStyle = .light
        return controller
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    let root: RootComponent
    
    var body: some View {
        ComposeView(root: root)
                .ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}



