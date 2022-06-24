import { Input } from "@chakra-ui/react";
import { Heading } from "@chakra-ui/react";

const imagePage = () => {
  return (
    <div className="main">
      <div className="header">
        <Heading className="heading-title" as="h1" size="3xl">
          Image Upload Page
        </Heading>
      </div>
      <main>
        <Input type="file" />
      </main>
      <style jsx>{`
        .main {
          height: 100vh;
          background-color: rgb(110, 110, 110);
        }
        .header {
          padding: 20px 20px 30px 20px;
        }
      `}</style>
    </div>
  );
};

export default imagePage;
