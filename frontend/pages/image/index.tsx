import { Input } from "@chakra-ui/react";
import { Heading } from "@chakra-ui/react";
import { readFile } from "fs";

const imagePage = () => {
  const onImageSelected = (e: any) => {
    console.log(e.target.files[0]);
    let file: File = e.target.files[0];

    if (file.type === "image/png" || file.type === "image/jpeg") {
      let reader = new FileReader();
      reader.readAsDataURL(file);
      reader.onload = () => {
        console.log("reader.result");
        let e = reader.result;
        console.log(typeof e);
        console.log(e);
      };
      reader.onerror = function (error) {
        console.log("Error: ", error);
      };
    } else {
      console.log("File not supported");
    }
  };
  return (
    <div className="main">
      <div className="header">
        <Heading className="heading-title" as="h1" size="3xl">
          Image Upload Page
        </Heading>
      </div>
      <main>
        <Input type="file" onChange={onImageSelected} />
      </main>
      <style jsx>{`
        .main {
          height: 100vh;
          background-color: rgb(224, 212, 159);
        }
        .header {
          padding: 20px 20px 30px 20px;
        }
      `}</style>
    </div>
  );
};

export default imagePage;
